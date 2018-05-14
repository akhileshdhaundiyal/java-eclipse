import { Component, OnInit } from '@angular/core';

export class InventionsHub
{
  name: string;
  inventor: string;
  year: string;
}

@Component({
  selector: 'app-inventions-hub',
  templateUrl: './inventions-hub.component.html',
  styleUrls: ['./inventions-hub.component.css']
})

export class InventionsHubComponent{

  nameModel: string;
  inventorModel: string;
  yearModel: string;
  inventions: InventionsHub[];
   
  title = 'Swagat to aawishkar';
  
  constructor(){
    this.nameModel = '';
    this.inventorModel = '';
    this.yearModel = '';
    
    let defaultInvention : InventionsHub ={
      name: 'C++',
      inventor: 'Dennis Horara',
      year: '1920'
    };
    
    this.inventions = [defaultInvention];
  }
  
  ngOnInit(){  
  }

  createInvention(){
    let newInvention: InventionsHub ={
      name: this.nameModel,
      inventor: this.inventorModel,
      year: this.yearModel
  };
    
  this.inventions.push(newInvention);
  this.nameModel = this.yearModel = this.inventorModel = '';  
  }
}
    