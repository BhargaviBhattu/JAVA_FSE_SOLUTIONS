import React from 'react';
import CalculateScore from './Components/CalculateScore';

function App() {
  return (
    <div className="App">
      <CalculateScore name="Bhargavi" school="Gitanjali English Medium High School" total={450} goal={5} />
    </div>
  );
}

export default App;

