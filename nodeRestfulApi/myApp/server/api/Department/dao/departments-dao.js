import Promise from 'bluebird';
import models from '../../../models';
// const Department = require('/home/sb-33/Desktop/myApp/server/models/department').Department;

export default class departmentsDao {

  static getById(id) {
    console.log('Search Method called');
    // console.log('DepartmentsDao method Called');
    return new Promise(
      (resolve, reject) => {
        /*models.Department.find({})
          .then(departments => {
            resolve(departments);
          });*/
      });
  }


  static getAll(_query) {
    return new Promise((resolve, reject) => {
      // console.log('departmentsDao getAll method called ')
      //console.log(userSchema)
      models.Department.findAll()
        .then(departments => {
          //console.log('all users are'+JSON.stringify(users))
          resolve(departments);
        });
    });
  }


  static add(body) {
    // console.log('DepartmentDao add method called');
    console.log(body);
    return new Promise((resolve, reject) => {
      models.Department
        .create({
          deptName: body.deptName,
          id: parseInt(body.id),
          employeeId: parseInt(body.empId)
        })
        .then((department) => res.status(201).send(department))
        .catch((error) => res.status(400).send(error))
    });
  }

  static deleteMember(id){
    console.log('Delete Method Called');
    return new Promise((resolve,reject) => {

      models.Department.destroy({
        where:
          {
            id: id
          }
      }).then(deldept => {
          console.log(deldept);
          resolve(deldept);
        },
        (error) => {
          reject(error);
        });
    });
  }


  static updateDepartment(body,id){
    console.log('Update Method Called');
    return new Promise((resolve,reject) => {
      models.Department.update(
        {
          deptName: body.deptName
        },
        {
          where:
            {
              id: id
            }
        })
        .then(updateDept => {
          // console.log(updttudents)
          resolve(updateDept);
        }, (error) => {
          reject(error);
        });
    });
  }
}














