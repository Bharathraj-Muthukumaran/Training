import { Component } from '@angular/core';
import { CalculatorService } from '../calculator.service';

@Component({
  selector: 'app-childr',
  templateUrl: './childr.component.html',
  styleUrl: './childr.component.css'
})
export class ChildrComponent {
  /*flag : boolean;
  vehicles : string[];
  selectedVehicle : string;
  myStyle :{};*/
  sum : number;
  sub : number;
  constructor(private calc : CalculatorService, private fact : FactorialService ){
    this.sum = calc.getAddition(10,20);
    this.sub = calc.getSubtraction(10,20);
  }

  /*constructor() {
    this.flag = true;
    this.vehicles = ["TwoWheeler","ThreeWheeler","FourWheeler"];
    this.selectedVehicle ="";
    this.myStyle = {'width' : '40%','border' : '2px solid green','border-radius' : '25px'};
  }*/
    /*changeFlag(){
    this.flag = ! this.flag;
  }
  setSelectedItem(vec : string){
    this.selectedVehicle=vec;
  }
  changeStyle(){
    this.myStyle ={'width' : '40%','border' : '2px solid red','border-radius' : '25px' };
  }*/
}