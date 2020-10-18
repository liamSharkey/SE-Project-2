let coordProtoype = {
    x: 0,
    y: 0,
    z: 0
};

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

let p1 = new Point(1,2,3);
let p2 = new Point(3,-1,3);

let result = p1.calcDistance(p2);
console.log(result);
