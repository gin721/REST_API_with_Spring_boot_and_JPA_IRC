import { useState } from 'react';
import Home from './pages/Home';
import Login from './pages/Login';
import ProtectedRouted from './pages/ProtectedRoute';
import SignUp from './pages/SignUp';
import Info from './pages/Info';


export const routes = [
    {
        path: '/',
        element: <Home />,
    },
    {
        path: '/login',
        element: <Login/>,
    },
    {
        path: '/signup',
        element: <SignUp />
    },
    {
        path: '/info',
        element: <Info/>
    }
];
