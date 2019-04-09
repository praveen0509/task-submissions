
const expressjs = require('express');
const app = expressjs();
const bodyParser = require('body-parser');

app.use(bodyParser.urlencoded({ExtendedCode: true}))

app.listen(3000, function(){
    console.log('listening to port 3000');
})

app.get('/world', function(request, response){
    response.send('Hello world');
})


app.get('/', (request, response) => {
    response.sendFile('/home/sb-33/Desktop/nodeExpressServerConnect/index.html');
})


app.post('/formValues', (request, response) => {
    console.log('Form Data displayed');
    console.log(request.body.username + " " + request.body.email);
})


