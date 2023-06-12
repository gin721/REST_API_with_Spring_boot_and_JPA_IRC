import React from 'react';
import { BrowserRouter, Route, Routes } from 'react-router-dom';
import {ProtectedRoute} from './components/ProtectedRoute'
import Login from './pages/auth/Login';
import SignUp from './pages/auth/SignUp';
import Error404 from './pages/Error404';
import Landing from './pages/home/Landing';
import Home from './pages/home/Home';
import Info from './pages/auth/Info';

export default function App(){
  return (
    <BrowserRouter>
      <Routes>
        <Route index element={
          <ProtectedRoute>
            <Home/>
          </ProtectedRoute>
        }/>
        <Route path='/login' element={<Login/>}/>
        <Route path='/signup' element={<SignUp/>}/>
        <Route path='/info' element={<Info/>}/>
        <Route path='*' element={<Error404/>}/>
        <Route path='/landing' element={<Landing/>}/>
      </Routes>
    </BrowserRouter>
  )
}
