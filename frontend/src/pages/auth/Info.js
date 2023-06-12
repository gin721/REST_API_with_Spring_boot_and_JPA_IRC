import React from 'react'
import { useNavigate, useSearchParams } from 'react-router-dom'
import { yupResolver } from "@hookform/resolvers/yup";
import * as yup from "yup";
import { useForm } from 'react-hook-form';
import axios from 'axios';

export default function Info() {
    const [searchParam] = useSearchParams();
    const navigate = useNavigate();

    const schema = yup.object().shape({
        firstName: yup.string()
            .required("First Name is required"),
        lastName: yup.string()
            .required("Last Name is required"),
        address: yup.string()
            .required("Address is required"),
        state: yup.string()
            .required("State is required"),
        country: yup.string()
            .required("Country is required"),
        pinCode: yup.string()
            .required("Pin Code is required")
      });

    const {
        register,
        handleSubmit,
        formState: { errors }
    } = useForm({
        resolver: yupResolver(schema)
    });
    
    const onSubmit = (data) => {
        console.log(data);
        axios.post('http://localhost:8080/signup', {
            email: searchParam.get("email"),
            firstName: data.firstName,
            lastName: data.lastName,
            password: searchParam.get("password"),
            address: {
                address: data.address,
                state:data.state,
                country:data.country,
                pinCode:data.pinCode
            }
          })
          .then(function (response) {
            alert(response.data.message);
            localStorage.setItem("currentUser", data.email);
            navigate("/");
          })
          .catch(function (error) {
            console.log(error);
          });
    };

    return (
    <div className="bg-gray-200 flex min-h-screen items-center justify-center">
        <div className="mx-auto mt-6 w-full px-4 lg:w-8/12">
            <div className="relative mb-6 flex w-full min-w-0 flex-col bg-gray-100 shadow-md">
                <div className="mb-0 bg-white px-6 py-6">
                    <div className="flex justify-between text-center">
                        <h6 className="text-xl font-bold text-gray-700 md:px-4">Enter your details</h6>
                    </div>
                </div>
            <div className="flex-auto bg-slate-100 px-4 py-10 pt-0 lg:px-10">
                <form noValidate onSubmit={handleSubmit(onSubmit)}>
                    <h6 className="mb-5 mt-3 py-1 text-sm font-bold text-gray-400">User Information</h6>
                    <div className="flex flex-wrap">
                        <div className="w-full px-4 lg:w-6/12">
                            <div className="relative mb-5 w-full">
                                <label className="mb-2 block text-xs font-bold text-gray-600" htmlFor="grid-password"> First Name </label>
                                <input 
                                    autoComplete='off'
                                    type="text" 
                                    className="w-full rounded border-0 bg-white px-3 py-3 text-sm text-gray-600 placeholder-gray-300 shadow transition-all duration-150 ease-linear focus:outline-none focus:ring"
                                    {... register("firstName")}
                                />
                                <p className="mt-1 text-red-600 text-sm">{errors.firstName?.message}</p>
                            </div>
                        </div>
                        <div className="w-full px-4 lg:w-6/12">
                            <div className="relative mb-5 w-full">
                                <label className="mb-2 block text-xs font-bold text-gray-600" htmlFor="grid-password"> Last Name </label>
                                <input 
                                    type="text" 
                                    className="w-full rounded border-0 bg-white px-3 py-3 text-sm text-gray-600 placeholder-gray-300 shadow transition-all duration-150 ease-linear focus:outline-none focus:ring"
                                    autoComplete='off'
                                    {... register("lastName")}
                                />
                                <p className="mt-1 text-red-600 text-sm">{errors.lastName?.message}</p>
                            </div>
                        </div>
                        <div className="w-full px-4 lg:w-6/12">
                            <div className="relative mb-5 w-full">
                                <label className="text-gray-600 mb-2 block text-xs font-bold" htmlFor="grid-password"> Email </label>
                                <input 
                                    type="text" 
                                    disabled={true} 
                                    value={searchParam.get("email")} 
                                    className="w-full rounded border-0 bg-white px-3 py-3 text-sm text-gray-600 placeholder-gray-300 shadow transition-all duration-150 ease-linear focus:outline-none focus:ring"
                                />
                            </div>
                        </div>
                        <div className="w-full px-4 lg:w-6/12">
                            <div className="relative mb-5 w-full">
                                <label className="text-gray-600 mb-2 block text-xs font-bold" htmlFor="grid-password"> Password </label>
                                <input 
                                    type="text" 
                                    disabled={true} 
                                    value={searchParam.get("password")} 
                                    className="w-full rounded border-0 bg-white px-3 py-3 text-sm text-gray-600 placeholder-gray-300 shadow transition-all duration-150 ease-linear focus:outline-none focus:ring"
                                />
                            </div>
                        </div>
                    </div>
                    <h6 className="text-gray-400 mb-6 mt-3 text-sm font-bold">Address Information</h6>
                    <div className="flex flex-wrap">
                        <div className="lg:w-12/12 w-full px-4">
                            <div className="relative mb-5 w-full">
                                <label className="text-gray-600 mb-2 block text-xs font-bold" htmlFor="grid-password"> Address </label>
                                <input 
                                    type="text" 
                                    className="w-full rounded border-0 bg-white px-3 py-3 text-sm text-gray-600 placeholder-gray-300 shadow transition-all duration-150 ease-linear focus:outline-none focus:ring"
                                    autoComplete='off'
                                    {...register("address")}
                                />
                                <p className="mt-1 text-red-600 text-sm">{errors.address?.message}</p>
                            </div>
                        </div>
                        <div className="w-full px-4 lg:w-4/12">
                            <div className="relative mb-5 w-full">
                                <label className="text-gray-600 mb-2 block text-xs font-bold" htmlFor="grid-password"> State </label>
                                <input 
                                    type="email" 
                                    className="w-full rounded border-0 bg-white px-3 py-3 text-sm text-gray-600 placeholder-gray-300 shadow transition-all duration-150 ease-linear focus:outline-none focus:ring"
                                    autoComplete='off'
                                    {...register("state")}
                                />
                                <p className="mt-1 text-red-600 text-sm">{errors.state?.message}</p>
                            </div>
                        </div>
                        <div className="w-full px-4 lg:w-4/12">
                            <div className="relative mb-5 w-full">
                                <label className="text-gray-600 mb-2 block text-xs font-bold" htmlFor="grid-password"> Country </label>
                                <input 
                                    type="text" 
                                    className="w-full rounded border-0 bg-white px-3 py-3 text-sm text-gray-600 placeholder-gray-300 shadow transition-all duration-150 ease-linear focus:outline-none focus:ring"
                                    autoComplete='off'
                                    {...register("country")}
                                />
                                <p className="mt-1 text-red-600 text-sm">{errors.country?.message}</p>
                            </div>
                        </div>
                        <div className="w-full px-4 lg:w-4/12">
                            <div className="relative mb-5 w-full">
                                <label className="text-gray-600 mb-2 block text-xs font-bold" htmlFor="grid-password"> Postal Code </label>
                                <input 
                                    type="text" 
                                    className="w-full rounded border-0 bg-white px-3 py-3 text-sm text-gray-600 placeholder-gray-300 shadow transition-all duration-150 ease-linear focus:outline-none focus:ring"
                                    autoComplete='off'
                                    {...register("pinCode")}
                                />
                                <p className="mt-1 text-red-600 text-sm">{errors.pinCode?.message}</p>
                            </div>
                        </div>
                        <div className="w-full px-4 lg:w-10/12">
                        </div>
                        <div className="w-full px-4 lg:w-2/12">
                                <button type='submit' className=" bg-blue-500 hover:bg-blue-700 text-white font-bold py-2 px-4 ml-7 mt-2 rounded">Submit</button>
                        </div>
                    </div>
                </form>
            </div>
            </div>
        </div>
    </div>
  )
}
