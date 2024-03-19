package MainFunction.designpattern.elevator;

public class HelperFunction {
    Elevator elevator;


    public void add(Request request){

        if (elevator.currentState.equals(State.IDLE)){
            elevator.currentJobs.add(request);
        }
        else if (elevator.currentState.equals(State.MOVING)){
            if (elevator.currentDirection!=request.getExternalRequest().getDirectionToGo()){
                //addto pending job
                addtoPendingJob(request);
            }
            else if (elevator.currentDirection.equals(Direction.UP) && request.getInternalRequest().getDestinationFloor()<elevator.currentFloor){
                 //add to pending job
                addtoPendingJob(request);
            }
            else if(elevator.currentDirection.equals(Direction.DOWN) && request.getInternalRequest().getDestinationFloor()>elevator.currentFloor){
                //add to pending floor
                addtoPendingJob(request);
            }
            else elevator.currentJobs.add(request);

        }
    }

    public void addtoPendingJob(Request r){
        if (r.getExternalRequest().getDirectionToGo().equals(Direction.UP)){
            elevator.upPendingJobs.add(r);
        }
        else elevator.downPendingJobs.add(r);}

}
