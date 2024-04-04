import React, { useState } from 'react';

function Lol() {

  // Estado para controlar si se muestra el div con los huecos del equipo
  const [showTeamDiv, setShowTeamDiv] = useState(false);
  const [buttonClicked, setButtonClicked] = useState(false);

  // Función para manejar el clic en el botón "Create a team"
  const handleCreateTeamClick = () => {
    setShowTeamDiv(true);
    setButtonClicked(true);
  };

  const handleDissolveTeamClick = () => {
    setShowTeamDiv(false);
    setButtonClicked(false);
  };

  return (
    <div className='App'>
      <h2>League of Legends | Victory Vault</h2>
      <p>Take part in matches in League of Legends with your team.</p>
      <p>Compete against other teams and earn real money!</p>
      
      {/* Botón para crear un equipo */}
      {!buttonClicked && (
        <div className='create-team'>
          <button onClick={handleCreateTeamClick}>Create a team</button>
        </div>
      )}

      {/* Div con los huecos del equipo (se mostrará si showTeamDiv es true) */}
      {showTeamDiv && (
        <div className='team-div'>
          <p>Team name: XXXXXX</p>

          <ul>
            <li>Tu nombre (ocupado)</li>
            <li>Hueco 2</li>
            <li>Hueco 3</li>
            <li>Hueco 4</li>
            <li>Hueco 5</li>
          </ul>

          <p>Copia este link para invitar a tus amigos: XXXX</p>
          
          <button onClick={handleDissolveTeamClick}>Dissolve team</button>
        </div>
      )}

      <div className='open-matches'>
        <p>Join a match with your team</p>
        <button>Join HERE</button>
        <p>Entry price: 25€ (Whole team)</p>
        <p>Prize pool: 40€</p>
      </div>

      <div className='active-matches'>
        <p>Ongoing matches</p>
        <p>Time: xx:xx:xx</p>
      </div>
    </div>
  );
}

export default Lol;