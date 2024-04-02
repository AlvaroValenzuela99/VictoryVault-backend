import React from 'react';
import './App.css';
import { BrowserRouter,Routes, Route } from 'react-router-dom';
import Home from './pages/Home';
import Fifa from './pages/Fifa';

function App() {
  return (
    <BrowserRouter>
      <Routes>
        {/* Ruta Home */}
        <Route path="/" element={<Home />} />

        {/* Ruta FIFA*/}
        <Route path="/fifa" element={<Fifa />} />
      </Routes>
    </BrowserRouter>
  );
}

export default App;
