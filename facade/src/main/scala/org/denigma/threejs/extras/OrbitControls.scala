package org.denigma.threejs.extras

import org.denigma.threejs.{ Vector3, Camera }
import org.scalajs.dom
import org.scalajs.dom.raw.HTMLElement

import scala.scalajs.js
import scala.scalajs.js.annotation.JSName

@js.native
@JSName("THREE.OrbitControls")
class OrbitControls(camera: Camera, element: HTMLElement) extends js.Object {

    def this(camera: Camera) = this(camera, null) // scalastyle:ignore

    var target: Vector3 = js.native;

    var enabled: Boolean = js.native;

    // How far you can dolly in and out ( PerspectiveCamera only )
    var minDistance: Double = js.native;
    var maxDistance: Double = js.native;

    // How far you can zoom in and out ( OrthographicCamera only )
    var minZoom: Double = js.native;
    var maxZoom: Double = js.native;

    // How far you can orbit vertically, upper and lower limits.
    // Range is 0 to Math.PI radians.
    var minPolarAngle: Double = js.native; // radians
    var maxPolarAngle: Double = js.native; // radians

    // How far you can orbit horizontally, upper and lower limits.
    // If set, must be a sub-interval of the interval [ - Math.PI, Math.PI ].
    var minAzimuthAngle: Double = js.native; // radians
    var maxAzimuthAngle: Double = js.native; // radians

    // Set to true to enable damping (inertia)
    // If damping is enabled, you must call controls.update() in your animation loop
    var enableDamping: Boolean = js.native;
    var dampingFactor: Double = js.native;

    // This option actually enables dollying in and out; left as "zoom" for backwards compatibility.
    // Set to false to disable zooming
    var enableZoom: Boolean = js.native;
    var zoomSpeed: Double = js.native;

    // Set to false to disable rotating
    var enableRotate: Boolean = js.native;
    var rotateSpeed: Double = js.native;

    // Set to false to disable panning
    var enablePan: Boolean = js.native;
    var keyPanSpeed: Double = js.native; // pixels moved per arrow key push

    // Set to true to automatically rotate around the target
    // If auto-rotate is enabled, you must call controls.update() in your animation loop
    var autoRotate: Boolean = js.native;
    var autoRotateSpeed: Double = js.native; // 30 seconds per round when fps is 60

    // Set to false to disable use of the keys
    var enableKeys: Boolean = js.native;

    def rotateLeft(angle: Double): Unit = js.native

    def rotateRight(angle: Double): Unit = js.native

    def rotateUp(angle: Double): Unit = js.native

    def rotateDown(angle: Double): Unit = js.native

    def zoomIn(zoomScale: Double): Unit = js.native

    def zoomOut(zoomScale: Double): Unit = js.native

    def pan(distance: Vector3): Unit = js.native

    def update(): Unit = js.native

    def getAutoRotationAngle(): Double = js.native

    def getZoomScale(): Double = js.native

    def onMouseDown(event: dom.MouseEvent): Unit = js.native

    def onMouseUp(event: dom.MouseEvent): Unit = js.native

    def onMouseWheel(event: dom.MouseEvent): Unit = js.native

    def onMouseMove(event: dom.MouseEvent): Unit = js.native

    def onKeyDown(event: dom.KeyboardEvent): Unit = js.native

    def onKeyUp(event: dom.KeyboardEvent): Unit = js.native

}
