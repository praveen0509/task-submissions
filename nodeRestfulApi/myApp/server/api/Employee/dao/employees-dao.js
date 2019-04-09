import Promise from 'bluebird';
import models from '../../../models';

export default class employeesDao {

  static getById(id) {
    console.log(id);
    return new Promise(
      (resolve, reject) => {
        models.Employee.find({ where : {id: parseInt(id)} })
          .then(employees => {
            resolve(employees);
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
    // console.log('Dao add method called');
    return new Promise((resolve, reject) => {
      models.Employee
        .create({
          empName: body.empName,
          id: body.id
        })
        .then()
        .catch()
    });
  }

  static deleteMember(id){
    console.log('Delete Method Called');
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


  static updateEmployee(req,id){
    console.log('Update Method Called');
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














