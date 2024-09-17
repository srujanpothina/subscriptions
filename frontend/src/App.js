import React, { useEffect, useState } from 'react';
import axios from 'axios';

function App() {
  const [message, setMessage] = useState('');

  useEffect(() => {
    console.log('Fetching message from backend...');

    axios.get('http://localhost:30000/hello') // Call the backend endpoint
      .then(response => {
        console.log(response.data);

        // Check if the response data is an object
        if (typeof response.data === 'object' && response.data !== null) {
          // Assuming the backend returns an object like { message: "Hello!" }
          setMessage(response.data.message || ''); // Use a specific property
        } else {
          setMessage(response.data); // If it's a string, set it directly
        }
      })
      .catch(error => {
        console.error('Error fetching the message:', error);
      });
  }, []);

  return (
    <div>
      <h1>Hello World from React!</h1>
      <p>{message}</p>
    </div>
  );
}

export default App;
