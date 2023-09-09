import React from "react";
import { BrowserRouter, Route, Routes } from "react-router-dom";
import Layout from "../pages/layout/Layout";
import Error404 from "../pages/error404/Error404";
import Home from "../pages/home/Home";
import ServiceStatus from "../pages/serviceStatus/ServiceStatus";
import ServiceSummary from "../pages/serviceSummary/ServiceSummary";



const AppRouter = () => {
  return (
    <BrowserRouter>
      
        <Routes>
          <Route element={<Layout />}>
             <Route path="/" Component={Home} /> 
             <Route path="estado-servicio" Component={ServiceStatus} /> 
             <Route path="resumen-pedido" Component={ServiceSummary} /> 
          </Route>
    
          <Route path="*" Component={Error404} />
        </Routes>
      
    </BrowserRouter>
  );
};

export default AppRouter;