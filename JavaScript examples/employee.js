class Employee
{
    //_firstName;
    //_lastName;
    //_employeeId;
    //email;

    constructor(_firstName,_lastName,_employeeId,_email)
    {
        this._firstName=_firstName;
        this._lastName=_lastName;
        this._employeeId=_employeeId;
        this._email=_email;
        console.log('within parameterized constructor');
    }

      getDetails()
     {
         return 'Employee ID: '+this._employeeId+' First Name: '+this._firstName+' Last Name: '+this._lastName+' Email: '+this._email;
     }

}


let employee1=new Employee('John','Lennon',101,'johnlennon9@gmail.com');
console.log(employee1.getDetails());
let employee2=new Employee('Paul','McCartney',102,'paulmccartney18@hotmail.com');
console.log(employee2.getDetails());