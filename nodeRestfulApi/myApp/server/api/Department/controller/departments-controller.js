import departmentsDao from '../dao/departments-dao';
import employeesDao from "../../Employee/dao/employees-dao";

export default class departmentsController {
  static getAll(req, res) {
    // var _deptName = req.query.deptName;
      const deptQuery = req.query;
    departmentsDao.getAll(deptQuery).then(departments => {
                          res.status(200);
                         // console.log('DepartmentsController getAll method Called');
                    }).catch(error => res.status(400).json(error));
  }


  static getById(req, res){
    let _id = 100;
    departmentsDao.getById(_id).then(departments => {
                  res.status(200);
                  res.send(_id);
      // console.log('DepartmentsController getById method Called');
    }).catch(error => res.status(400).json(error));

  }


  static add(req, res){
     let _body = req.body;
     departmentsDao.add(_body).then(departments => {
       res.status(200);
       // console.log('DepartmentsController getById method Called');
     }).catch(error => res.status(400).json(error));
  }

  static deleteMember(req,res)
  {
    let _req = req.params.id;
    console.log(req.params.id);
    departmentsDao.deleteMember(_req).then((deleteDepartment) => {
      res.status(200).json(deleteDepartment).send(deleteDepartment);
    })
      .catch(error => res.json(error))
  }


  static updateDepartment(req,res)
  {
    let id = req.params.id;
    let body = req.body;
    departmentsDao.updateDepartment(body,id).then((us) => {
      res.status(200).send(us);
    })
      .catch(error => {res.status(400).json(error)})
  }


}











