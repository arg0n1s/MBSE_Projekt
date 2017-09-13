package UI;

import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Shell;
import Models.ModelLoader;
import TGG.ReqToImpTransformatorCorr;

import org.eclipse.swt.widgets.List;

import java.io.File;

import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.graphics.Image;
import org.eclipse.swt.custom.StyledText;
import org.eclipse.jface.text.TextViewer;
import org.eclipse.swt.custom.ScrolledComposite;

public class MainWindow {

	protected Shell shlNetworkMapping;
	private ModelLoader models;

	/**
	 * Launch the application.
	 * @param args
	 */
	public static void main(String[] args) {
		try {
			MainWindow window = new MainWindow();
			window.open();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public MainWindow(){
		models = new ModelLoader();
		models.loadModelFilesDefaultPath();
	}

	/**
	 * Open the window.
	 */
	public void open() {
		Display display = Display.getDefault();
		createContents();
		shlNetworkMapping.open();
		shlNetworkMapping.layout();
		while (!shlNetworkMapping.isDisposed()) {
			if (!display.readAndDispatch()) {
				display.sleep();
			}
		}
	}

	/**
	 * Create contents of the window.
	 */
	protected void createContents() {
		shlNetworkMapping = new Shell();
		shlNetworkMapping.setSize(1300, 1000);
		shlNetworkMapping.setText("Network Mapping");
		
		ScrolledComposite scrolledComposite = new ScrolledComposite(shlNetworkMapping, SWT.BORDER | SWT.H_SCROLL | SWT.V_SCROLL);
		scrolledComposite.setAlwaysShowScrollBars(true);
		scrolledComposite.setBounds(134, 109, 1156, 859);
		scrolledComposite.setExpandHorizontal(true);
		scrolledComposite.setExpandVertical(true);
		
		TextViewer textSource = new TextViewer(shlNetworkMapping, SWT.BORDER);
		StyledText sourcePath = textSource.getTextWidget();
		sourcePath.setText("Source Model");
		sourcePath.setBounds(134, 70, 132, 33);
		
		TextViewer textTarget = new TextViewer(shlNetworkMapping, SWT.BORDER);
		StyledText targetPath = textTarget.getTextWidget();
		targetPath.setText("Target Model");
		targetPath.setBounds(282, 70, 132, 33);
		
		List list = new List(shlNetworkMapping, SWT.BORDER);
		list.setBounds(10, 109, 110, 296);
		for(String model : models.getModelNames()){
			list.add(model);
		}
		list.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e){
				Image im = null;
				try {
					im = new Image(shlNetworkMapping.getDisplay(), models.getModelPNGFileInputStream(list.getItem(list.getFocusIndex())));
				} catch (Exception e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				Label label = new Label( scrolledComposite, SWT.NONE );
				label.setImage( im );
				scrolledComposite.setContent( label );
				scrolledComposite.setMinSize(im.getBoundsInPixels().width, im.getBoundsInPixels().height);
			}
		});
		
		Button btnLoadModels = new Button(shlNetworkMapping, SWT.NONE);
		btnLoadModels.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				models.loadModelFilesDefaultPath();
				list.removeAll();
				for(String model : models.getModelNames()){
					list.add(model);
				}
			}
		});
		btnLoadModels.setBounds(10, 75, 110, 28);
		btnLoadModels.setText("Load Models");
		
		Button btnSetAsSrcmodel = new Button(shlNetworkMapping, SWT.NONE);
		btnSetAsSrcmodel.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				String srcItem = list.getItem(list.getFocusIndex());
				try {
					if(models.getModel(srcItem).isInstanceOf("RequirementsModel")){
						sourcePath.setText(list.getItem(list.getFocusIndex()));
					}
				} catch (Exception e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}
		});
		btnSetAsSrcmodel.setBounds(134, 36, 132, 28);
		btnSetAsSrcmodel.setText("Set as Src-Model");
		
		Button btnSetAsTrgmodel = new Button(shlNetworkMapping, SWT.NONE);
		btnSetAsTrgmodel.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				String trgItem = list.getItem(list.getFocusIndex());
				try {
					if(models.getModel(trgItem).isInstanceOf("ImplementationModel")){
						targetPath.setText(list.getItem(list.getFocusIndex()));
					}
				} catch (Exception e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}
		});
		btnSetAsTrgmodel.setBounds(282, 36, 132, 28);
		btnSetAsTrgmodel.setText("Set as Trg-Model");
		
		Button btnFindMapping = new Button(shlNetworkMapping, SWT.NONE);
		btnFindMapping.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				File src = models.getModelFile(sourcePath.getText().toString());
				File trg = models.getModelFile(targetPath.getText().toString());
				if(src != null && trg != null){
					try {
						ReqToImpTransformatorCorr.runCorrelation(src, trg);
					} catch (Exception e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
				}
				
			}
		});
		btnFindMapping.setBounds(10, 36, 110, 28);
		btnFindMapping.setText("Find Mapping");
		
		Button btnSafeToPNGButton = new Button(shlNetworkMapping, SWT.NONE);
		btnSafeToPNGButton.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				String selection = list.getItem(list.getFocusIndex());
				if(selection != null){
					try {
						models.saveModelToPNG(selection);
					} catch (Exception e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
				}
			}
		});
		btnSafeToPNGButton.setBounds(10, 411, 110, 33);
		btnSafeToPNGButton.setText("Selection to \nPNG");
		
		Button btnSafeToSVGButton = new Button(shlNetworkMapping, SWT.NONE);
		btnSafeToSVGButton.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				String selection = list.getItem(list.getFocusIndex());
				if(selection != null){
					try {
						models.saveModelToSVG(selection);
					} catch (Exception e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
				}
			}
		});
		btnSafeToSVGButton.setBounds(10, 441, 110, 33);
		btnSafeToSVGButton.setText("Selection to \nSVG");
		
	}
}
