import static org.junit.Assert.*;
import org.junit.*;

public class PhotographerTest {

  Photographer photographer;
  Camera camera;
  AnalogCamera analogCamera; 
  DigitalCamera digitalCamera; 

  @Before
  public void before() {
    photographer = new Photographer();
    camera = new Camera();
    analogCamera = new AnalogCamera("Nikon", 786533);
    digitalCamera = new DigitalCamera("Nikon", 786533);


  }

  @Test
  public void collectionStartsEmpty() {
    assertEquals(0, photographer.cameraCount() );
  }
  
  @Test 
  public void canAdd() {
    photographer.add( camera );
    assertEquals( 1, photographer.cameraCount() );
  }

  @Test
  public void canRemove() {
    photographer.add(camera);
    photographer.removeCamera(camera);
    assertEquals(0, photographer.cameraCount( ));
  }

  @Test
  public void addAnalogCameraToCollection() {
    photographer.add( analogCamera );
    assertEquals(1, photographer.cameraCount() );
  }

  @Test
  public void addDigitalCameraToCollection() {
    photographer.add( digitalCamera );
    assertEquals(1,photographer.cameraCount() );
  }

  @Test
  public void printDetails() {
    photographer.add( digitalCamera );
    photographer.add( digitalCamera );
    assertEquals("Nikon | 786533", photographer.printDetails());
  }

}