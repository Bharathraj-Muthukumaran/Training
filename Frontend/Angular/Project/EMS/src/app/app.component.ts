import { Component } from '@angular/core';
import { Employee } from './model/Employee';
import { EmployeeService } from './employee.service';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrl: './app.component.css'
})
export class AppComponent {
  //title = 'EMS';
  employee : Employee ;
  result : string
  employeeArr : Employee[];
  flag:boolean;

   constructor(private service : EmployeeService){
    this.employee = new Employee();
    this.result = "";
    this.employeeArr =[];
    this.flag=false;
   }

 insertEmployee(data : any) {
  this.employee.id = data.empId;
  this.employee.empName = data.empName;
  this.employee.empSalary = data.empSalary;
  alert(data.empId+" "+data.empName+" "+data.empSalary);

  this.result=this.service.insertEmployee(this.employee);
 }
}
