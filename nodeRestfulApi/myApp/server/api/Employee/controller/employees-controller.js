import employeesDao from '../dao/employees-dao';

export default class employeesController {
  static getAll(req, res) {
    // var _deptName = req.query.deptName;
    const deptQuery = req.query;
    console.log("Employee getAll Method Called ");
    employeesDao.getAll(deptQuery).then(employees => {
      res.status(200);
      // console.log('employeesController getAll method Called');
    }).catch(error => res.status(400).json(error));
  }


  static getById(req, res){
    let _id = req.params.id;
    console.log(req.params.id);
    employeesDao.getById(_id).then(employees => {
      res.status(200);
      res.send(_id);
     // console.log('employeesController getById method Called');
    }).catch(error => res.status(400).json(error));

  }


  static add(req, res){
    let _body = req.body;
    console.log(req.body);
    // console.log('Employee Controller add method');
    employeesDao.add(_body).then(employees => {
      res.status(200);
      // console.log('employeesController add  method Called');
    }).catch(error => res.status(400).json(error));
  }


  static deleteMember(req,res)
  {
    let _req = req.params.id;
    console.log(req.params.id);
    employeesDao.deleteMember(_req).then((deletestudent) => {
      res.status(200).json(deletestudent).send(deletestudent);
    })
      .catch(error => res.json(error))
  }


  static updateEmployee(req,res)
  {
    let id = req.params.id;
    let _req = req.body;
    employeesDao.updateEmployee(_req,id).then((us) => {
      res.status(200).json(us).send(us);
    })
      .catch(error => {res.status(400).json(error)})
  }

}
































