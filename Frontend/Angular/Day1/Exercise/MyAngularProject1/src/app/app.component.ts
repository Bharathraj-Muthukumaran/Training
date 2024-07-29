import { Component } from '@angular/core';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrl: './app.component.css'
})
export class AppComponent {
  name : string;
  age : number;
  email : string;
constructor(){
  this.name = "yash";
  this.age= 25;
  this.email = "bharath@googf.com";
}}
