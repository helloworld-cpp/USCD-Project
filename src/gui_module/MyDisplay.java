package gui_module;

import de.fhpotsdam.unfolding.UnfoldingMap;
import de.fhpotsdam.unfolding.data.Feature;
import de.fhpotsdam.unfolding.data.PointFeature;
import de.fhpotsdam.unfolding.geo.Location;
import de.fhpotsdam.unfolding.marker.Marker;
import de.fhpotsdam.unfolding.marker.SimplePointMarker;
import de.fhpotsdam.unfolding.providers.Google;
import de.fhpotsdam.unfolding.utils.MapUtils;
import processing.core.PApplet;
import processing.core.PImage;

public class MyDisplay extends PApplet {
	
		private UnfoldingMap map;
		
		public void setup() {
			size(950,600,OPENGL);
			map= new UnfoldingMap(this,200,50,700,500,new Google.GoogleMapProvider());
			map.zoomToLevel(3);
			MapUtils.createDefaultEventDispatcher(this,map);
			
			
			Location valLoc= new Location(-38.14f,-73.03f);
			Feature ValEq = new PointFeature(valLoc);
			ValEq.addProperty("title","Valdivia,Chile");
			ValEq.addProperty("magnitude","9.5");
			ValEq.addProperty("date","May 22, 1960");
			ValEq.addProperty("year","1960");
			
			Marker valMk = new SimplePointMarker (valLoc,ValEq.getProperties());
			map.addMarker(valMk);
			
			
			
			
			
			
					
		}
		
		public void draw() {
			background(10);
			map.draw();
			
		}
		
		
		
	
}
