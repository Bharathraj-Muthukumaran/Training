import { Component } from '@angular/core';

@Component({
  selector: 'app-childr',
  templateUrl: './childr.component.html',
  styleUrl: './childr.component.css'
})
export class ChildrComponent {
  flag : boolean;
  vehicles : string[];
  selectedVehicle : string;
  myStyle :{};

  constructor() {
    this.flag = true;
    this.vehicles = ["TwoWheeler","ThreeWheeler","FourWheeler"];
    this.selectedVehicle ="";
    this.myStyle = {'width' : '40%','border' : '2px solid green','border-radius' : '25px'};
  }
  changeFlag(){
    this.flag = ! this.flag;
  }
  setSelectedItem(vec : string){
    this.selectedVehicle=vec;
  }
  changeStyle(){
    this.myStyle ={'width' : '40%','border' : '2px solid red','border-radius' : '25px' };
  }
}