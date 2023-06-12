import React from "react";
import { useForm } from "react-hook-form";
import { yupResolver } from "@hookform/resolvers/yup";
import * as yup from "yup";
import { createSearchParams, useNavigate } from "react-router-dom";
import LoginImage from '../../static/login.jpg';


export default function SignUp(){
  const navigate = useNavigate();
  
  const passwordRules = /^(?=.*\d)(?=.*[a-z])(?=.*[A-Z]).{5,}$/;
  
  const schema = yup.object().shape({
    email: yup.string()
      .email("Email format is invalid")
      .required("Email is required"),
    password: yup.string()
      .required("Password is required")
      .matches(passwordRules, { message: "Please create a stronger password" }),
    confirmPassword: yup.string()
      .oneOf([yup.ref("password"), null], "Passwords must match")
      .required("This field is required"),
  });
  
  const { 
    register, 
    handleSubmit, 
    formState: { errors }, 
  } = useForm({
    resolver: yupResolver(schema),
  });
  
  const onSubmit = (data) => {
    navigate({
      pathname: "/info",
      search: createSearchParams({
        email: data.email,
        password: data.password
      }).toString()
    });
  }
  
  return (
    <div id="background" className="flex items-center justify-center min-h-screen bg-gray-200">
      <div id="form=box" className="relative flex flex-col m-6 space-y-8 bg-white shadow-2xl rounded-2xl md:flex-row md:space-y-0">
        <form id="form" noValidate className="flex flex-col justify-center p-8 md:p-14" 
          onSubmit={handleSubmit(onSubmit)}
        >
          <div 
            id="welcome-text" 
            className="flex flex-col"
          >
            <span className="mb-3 text-4xl font-bold">Create your account</span>
            <span className="font-light text-gray-400 mb-8">Enter your details to create an account</span>
          </div>
          <div id="email" className="py-2">
            <span className="block text-md font-medium text-slate-700 mb-2">Email</span>
            <input
              autoComplete='off'
              type="text"
              className="w-full p-2 px-3 mt-1 border border-gray-300 rounded-md placeholder:font-light placeholder:text-gray-500 focus:placeholder-gray-500"
              {... register('email')}
            />
            <p className="mt-1 text-red-600 text-sm">{errors.email?.message}</p>
          </div>
          <div id="password" className="py-1">
            <span className="font-normal mb-2 text-md">Password</span>
            <input
              autoComplete="off"
              type="text"
              className="w-full p-2 px-3 mt-1 border border-gray-300 rounded-md placeholder:font-light placeholder:text-gray-500 focus:placeholder-gray-500"
              id="pass-field"
              name="pass-field"
              {... register('password')}
            />
            <p className="mt-2 text-red-600 text-sm">{errors.password?.message}</p>
          </div>
          <div id="confirm-password" className="py-1">
            <span className="font-normal mb-2 text-md">Confirm Password</span>
            <input
              autoComplete="off"
              type="text"
              className="w-full p-2 px-3 mt-1 border border-gray-300 rounded-md placeholder:font-light placeholder:text-gray-500 focus:placeholder-gray-500"
              id="pass-field"
              name="pass-field"
              {... register('confirmPassword')}
            />
            <p className="mt-2 text-red-600 text-sm">{errors.confirmPassword?.message}</p>
          </div>
          <div className="flex justify-between w-full">
            <div className="mr-24 mt-1">
              <span className="text-white">Accept terms and conditions</span>
            </div>
            <p className="font-bold text-white">Forgot password</p>
          </div>
          <button 
            type="submit" 
            id="sign-in-button" 
            className="w-full bg-black text-white p-2 rounded-lg mb-6 mt-2 hover:bg-white hover:text-black hover:border hover:border-gray-300"
          >
            Register
          </button>
          
          <div className="text-center text-gray-400">
            Already have an account?
            <a className="font-bold text-black" href="/login">  Login</a>
          </div>
        </form>
        <div id="image" className="relative">
          <img
            src={LoginImage}
            alt='Login img'
            className="w-[400px] h-full hidden rounded-r-2xl md:block object-cover"
          />
        </div>
      </div>
    </div>
  );
};