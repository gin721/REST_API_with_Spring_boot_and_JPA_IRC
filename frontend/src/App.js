import React, { Fragment } from 'react';
import { Route, Routes, useRoutes } from 'react-router-dom';
import { routes } from './routes';
import Home from './pages/Home';
import Login from './pages/Login';
import SignUp from './pages/SignUp';

export default function App() {
  const content = useRoutes(routes);
  return (
    <>
      {content}
    </>
  )
}
