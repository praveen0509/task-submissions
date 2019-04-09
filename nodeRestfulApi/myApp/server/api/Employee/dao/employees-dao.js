import Promise from 'bluebird';
import models from '../../../models';
const Employee = require('/home/sb-33/Desktop/myApp/server/models/employee').Employee;

export default class employeesDao {

  static getById(id) {
    console.log(id);
    console.log('employeesDao method Called');
    return new Promise(
      (resolve, reject) => {
        models.Department.find({})
          .then(departments => {
            resolve(departments);
          });
      });
  }


  static getAll(_query) {
    return new Promise((resolve, reject) => {
      console.log('employeesDao getAll method called ')
      //console.log(userSchema)
      models.Employee.findAll()
        .then(employees => {
          //console.log('all users are'+JSON.stringify(users))
          resolve(employees);
        });
    });
  }


  static add(body) {
    console.log('add method called');
    return new Promise((resolve, reject) => {
      models.Employee
        .create({
          empName: body.empName,
          id: parseInt(body.id)
        })
        .then((employee) => res.status(201).send(employee))
        .catch((error) => res.status(400).send(error))
    });
  }

  static deleteMember(id){
    return new Promise((resolve,reject) => {

      models.Employee.destroy({
        where:
          {
            id: id
          }
      }).then(delemp => {
          console.log(delemp);
          resolve(delemp);
        },
        (error) => {
          reject(error);
        });
    });
  }
  static updateStudent(req,id){
    return new Promise((resolve,reject) => {
      models.Employee.update(
        {
          empName: req.empName
        },
        {
          where:
            {
              id: id
            }
        })
        .then(updateEmp => {
          // console.log(updttudents)
          resolve(updateEmp);
        }, (error) => {
          reject(error);
        });
    });
  }



}














