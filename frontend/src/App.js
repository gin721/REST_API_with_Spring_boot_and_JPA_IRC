import React from 'react';
import { Route, Routes } from 'react-router-dom';
import {ProtectedRoute} from './components/ProtectedRoute'
import Login from './pages/auth/Login';
import SignUp from './pages/auth/SignUp';
import Error404 from './pages/Error404';
import Landing from './pages/home/Landing';
import Home from './pages/home/Home';
import Info from './pages/auth/Info';
import CategoryProducts from './pages/products/CategoryProducts';
import AllProducts from './pages/products/AllProducts';
import SingleProductDetails from './pages/products/SingleProductDetails';
import Contact from './pages/Contact';
import Cart from './pages/Cart';

export default function App(){
  return (
    <Routes>
      <Route path="/" element={<Home />} />
      <Route path="category/:categoryName" element={<CategoryProducts />} />
      <Route path="products" element={<AllProducts />} />
      <Route path="product/:productId" element={<SingleProductDetails />} />
      <Route path="contact" element={<Contact />} />
      <Route path="cart" element={<ProtectedRoute><Cart /></ProtectedRoute>} />
      <Route path='/login' element={<Login/>}/>
      <Route path='/signup' element={<SignUp/>}/>
      <Route path='/info' element={<Info/>}/>
      <Route path='*' element={<Error404/>}/>
      <Route path='/landing' element={<Landing/>}/>
    </Routes>
  )
}
