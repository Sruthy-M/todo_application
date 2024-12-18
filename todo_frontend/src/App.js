import React, { Component } from 'react';
import './App.css';
import './bootstrap.css'
import FirstComponent from './components/learning-examples/FirstComponent';
import SecondComponent from './components/learning-examples/SecondComponent';
import ThirdComponent from './components/learning-examples/ThirdComponent';
// eslint-disable-next-line
import TodoApp from './components/counter/todo/TodoApp';

class App extends Component {
  render() {
    return (
      // JSX
      <div className="App">
        <TodoApp />
      </div>
    );
  }
}

// eslint-disable-next-line
class LearningComponent extends Component {
  render() {
    return (
      // JSX
      <div className="LearningComponent">
        My First React Component.
        <FirstComponent />
        <SecondComponent></SecondComponent>
        <ThirdComponent></ThirdComponent>
      </div>
    );
  }
}

export default App