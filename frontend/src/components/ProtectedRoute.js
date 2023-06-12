import React from 'react'
import { Navigate } from "react-router-dom";

export const ProtectedRoute = ({redirectPath = '/landing', children}) => {
    if (localStorage.getItem("currentUser") == null) {
      return <Navigate to={redirectPath} replace />;
    }
    return children;
};