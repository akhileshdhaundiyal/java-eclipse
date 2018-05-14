import { Component } from '@angular/core';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent {
  title = 'angular ki class';
  showName: boolean = true;
  names = ['Sunil', 'Sunny', 'Ajay'];
  
  selection = 'name';  
  options = ['name', 'address', 'other']
  
  selectedAnimal = 'cat'
  animals = ['cat', 'dog', 'kanika']
  
  toggle()
  {
    this.showName = !this.showName;
  }
  onAnimalClicked(event:Event)
  {
    const clickedAnimal = event.srcElement.innerHTML.trim();
    this.selectedAnimal = clickedAnimal;
  }
}