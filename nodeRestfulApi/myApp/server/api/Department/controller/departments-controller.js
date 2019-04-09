import departmentsDao from '../dao/departments-dao';

export default class departmentsController {
  static getAll(req, res) {
    // var _deptName = req.query.deptName;
      const deptQuery = req.query;
    departmentsDao.getAll(deptQuery).then(departments => {
                          res.status(200);
                          console.log('DepartmentsController getAll method Called');
                    }).catch(error => res.status(400).json(error));
  }


  static getById(req, res){
    let _id = 100;
    departmentsDao.getById(_id).then(departments => {
                  res.status(200);
                  res.send(_id);
      console.log('DepartmentsController getById method Called');
    }).catch(error => res.status(400).json(error));

  }


  static add(req, res){
     let _body = req.body;
     departmentsDao.add(_body).then(departments => {
       res.status(200);
       console.log('DepartmentsController getById method Called');
     }).catch(error => res.status(400).json(error));

  }


}











