import java.util.*;

class Photographer {
  private ArrayList<Printable> collection;

  public Photographer(){
    this.collection = new ArrayList<Printable>();
  }

  public int cameraCount() {
    return this.collection.size();
  }

  public void add( Printable camera ) {
    this.collection.add(camera);
  }

  public void removeCamera(Camera camera) {
    if ( cameraCount() > 0 ){
      collection.remove( camera );
    }
  }

  public String printDetails() {
    //for each Printable type camera, : = in, this.collection of Printable type cameras
    for (Printable camera : this.collection) {
      return camera.printDetails();
    }
    return "done";
  }
}