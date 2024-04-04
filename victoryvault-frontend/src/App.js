import React from 'react';
import './App.css';
import { BrowserRouter,Routes, Route } from 'react-router-dom';
import Home from './pages/Home';
import Lol from './pages/Lol';

function App() {
  return (
    <BrowserRouter>
      <Routes>
        {/* Ruta Home */}
        <Route path="/" element={<Home />} />

        {/* Ruta Lol*/}
        <Route path="/lol" element={<Lol />} />
      </Routes>
    </BrowserRouter>
  );
}

export default App;
