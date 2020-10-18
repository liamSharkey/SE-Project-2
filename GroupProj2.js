//Creating a new prototype for Point objects
let coordProtoype = {
    x: 0,
    y: 0,
    z: 0
};

/*
Point constructor 
Takes 3 values (x,y,z coordinates)
Creates an object based on coordPrototype to compare the 3 parameter values to
Function calcDistance takes this object and takes the difference between the x, y, and z coordinates of both objects
Then it adds up the squares of those results and square roots the sum
*/
function Point(x, y, z){
    this.x = x;
    this.y = y;
    this.z = z;

    let anotherPoint = Object.create(coordProtoype);

    this.calcDistance = function(anotherPoint){
        x1 = anotherPoint.x;
        y1 = anotherPoint.y;
        z1 = anotherPoint.z;

        let distX = x1 - x;
        let distY = y1 - y;
        let distZ = z1 - z;

        let distSqrd = Math.pow(distX, 2) + Math.pow(distY, 2) + Math.pow(distZ, 2);
        let dist = Math.sqrt(distSqrd);

        return dist;
    }
}

//Create two objects of type point using the constructor function
let p1 = new Point(1,2,3);
let p2 = new Point(3,-1,3);

//Compare the difference in location between the two points in 3D space and print the resulting distance
let result = p1.calcDistance(p2);
console.log(result);
