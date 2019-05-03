from flask import Flask,jsonify
 

app = Flask(__name__)

@app.route("/")
def hello():
    return "hello world"

sample_json= [{

"coord": {

"lon": -0.13,

"lat": 51.51

},

"weather": [

{

"id": 701,

"main": "Mist",

"description": "mist",

"icon": "50n"

},

{

"id": 500,

"main": "Rain",

"description": "light rain",

"icon": "10n"

}

],

"base": "stations",

"main": {

"temp": 272.14,

"pressure": 1016,

"humidity": 74,

"temp_min": 269.15,

"temp_max": 275.15

},

"visibility": 10000,

"wind": {

"speed": 2.6,

"deg": 230

},

"clouds": {

"all": 36

},

"dt": 1456379732,

"sys": {

"type": 1,

"id": 5091,

"message": 0.0172,

"country": "GB",

"sunrise": 1456383302,

"sunset": 1456421582

},

"id": 2643743,

"name": "London",

"cod": 200

}]

@app.route('/api/getData', methods=['GET'])
def api_all():
    return jsonify(sample_json)
if __name__=='__main__':
    app.run(debug=True)


