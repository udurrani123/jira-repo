// Check-in and Check-out Process Implementation

class CheckInCheckOut {
    constructor() {
        this.records = {};
    }

    checkIn(name) {
        const timestamp = new Date();
        this.records[name] = {
            status: 'Checked In',
            time: timestamp
        };
        console.log(`${name} checked in at ${timestamp}`);
    }

    checkOut(name) {
        const timestamp = new Date();
        if (!this.records[name] || this.records[name].status !== 'Checked In') {
            console.log(`${name} cannot check out without checking in first.`);
            return;
        }
        this.records[name].status = 'Checked Out';
        this.records[name].checkoutTime = timestamp;
        console.log(`${name} checked out at ${timestamp}`);
    }

    getRecords() {
        return this.records;
    }
}

const cco = new CheckInCheckOut();

// Example Usage
cco.checkIn('John Doe');
cco.checkOut('John Doe');
console.log(cco.getRecords());