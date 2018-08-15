(ns cljs-react-material-ui.reagent
  (:refer-clojure :exclude [list stepper])
  (:require [reagent.core :as r]
            [reagent.impl.template]
            [reagent.interop :refer-macros [$ $!]]))

;(def selectable-list (r/adapt-react-class ((aget js/MaterialUI "makeSelectable") (aget js/MaterialUI "List"))))

(def app-bar (r/adapt-react-class (aget js/MaterialUI "AppBar")))
(def avatar (r/adapt-react-class (aget js/MaterialUI "Avatar")))
(def backdrop (r/adapt-react-class (aget js/MaterialUI "Backdrop")))
(def badge (r/adapt-react-class (aget js/MaterialUI "Badge")))
(def bottom-navigation (r/adapt-react-class (aget js/MaterialUI "BottomNavigation")))
(def bottom-navigation-action (r/adapt-react-class (aget js/MaterialUI "BottomNavigationAction")))
(def button (r/adapt-react-class (aget js/MaterialUI "Button")))
(def button-base (r/adapt-react-class (aget js/MaterialUI "ButtonBase")))
(def card (r/adapt-react-class (aget js/MaterialUI "Card")))
(def card-actions (r/adapt-react-class (aget js/MaterialUI "CardActions")))
(def card-content (r/adapt-react-class (aget js/MaterialUI "CardContent")))
(def card-header (r/adapt-react-class (aget js/MaterialUI "CardHeader")))
(def card-media (r/adapt-react-class (aget js/MaterialUI "CardMedia")))
(def checkbox (r/adapt-react-class (aget js/MaterialUI "Checkbox")))
(def chip (r/adapt-react-class (aget js/MaterialUI "Chip")))
(def circular-progress (r/adapt-react-class (aget js/MaterialUI "CircularProgress")))
(def click-away-listener (r/adapt-react-class (aget js/MaterialUI "ClickAwayListener")))
(def collapse (r/adapt-react-class (aget js/MaterialUI "Collapse")))
(def css-baseline (r/adapt-react-class (aget js/MaterialUI "CssBaseline")))
(def dialog (r/adapt-react-class (aget js/MaterialUI "Dialog")))
(def dialog-actions (r/adapt-react-class (aget js/MaterialUI "DialogActions")))
(def dialog-content (r/adapt-react-class (aget js/MaterialUI "DialogContent")))
(def dialog-content-text (r/adapt-react-class (aget js/MaterialUI "DialogContentText")))
(def dialog-title (r/adapt-react-class (aget js/MaterialUI "DialogTitle")))
(def divider (r/adapt-react-class (aget js/MaterialUI "Divider")))
(def drawer (r/adapt-react-class (aget js/MaterialUI "Drawer")))
(def expansion-panel (r/adapt-react-class (aget js/MaterialUI "ExpansionPanel")))
(def expansion-panel-actions (r/adapt-react-class (aget js/MaterialUI "ExpansionPanelActions")))
(def expansion-panel-details (r/adapt-react-class (aget js/MaterialUI "ExpansionPanelDetails")))
(def expansion-panel-summary (r/adapt-react-class (aget js/MaterialUI "ExpansionPanelSummary")))
(def fade (r/adapt-react-class (aget js/MaterialUI "Fade")))
(def form-control (r/adapt-react-class (aget js/MaterialUI "FormControl")))
(def form-control-label (r/adapt-react-class (aget js/MaterialUI "FormControlLabel")))
(def form-group (r/adapt-react-class (aget js/MaterialUI "FormGroup")))
(def form-helper-text (r/adapt-react-class (aget js/MaterialUI "FormHelperText")))
(def form-label (r/adapt-react-class (aget js/MaterialUI "FormLabel")))
(def grid (r/adapt-react-class (aget js/MaterialUI "Grid")))
(def grid-list (r/adapt-react-class (aget js/MaterialUI "GridList")))
(def grid-list-tile (r/adapt-react-class (aget js/MaterialUI "GridListTile")))
(def grid-list-tile-bar (r/adapt-react-class (aget js/MaterialUI "GridListTileBar")))
(def grow (r/adapt-react-class (aget js/MaterialUI "Grow")))
(def hidden (r/adapt-react-class (aget js/MaterialUI "Hidden")))
(def icon (r/adapt-react-class (aget js/MaterialUI "Icon")))
(def icon-button (r/adapt-react-class (aget js/MaterialUI "IconButton")))
(def input (r/adapt-react-class (aget js/MaterialUI "Input")))
(def input-adornment (r/adapt-react-class (aget js/MaterialUI "InputAdornment")))
(def input-label (r/adapt-react-class (aget js/MaterialUI "InputLabel")))
(def linear-progress (r/adapt-react-class (aget js/MaterialUI "LinearProgress")))
(def list (r/adapt-react-class (aget js/MaterialUI "List")))
(def list-item (r/adapt-react-class (aget js/MaterialUI "ListItem")))
(def list-item-avatar (r/adapt-react-class (aget js/MaterialUI "ListItemAvatar")))
(def list-item-icon (r/adapt-react-class (aget js/MaterialUI "ListItemIcon")))
(def list-item-secondary-action (r/adapt-react-class (aget js/MaterialUI "ListItemSecondaryAction")))
(def list-item-text (r/adapt-react-class (aget js/MaterialUI "ListItemText")))
(def list-subheader (r/adapt-react-class (aget js/MaterialUI "ListSubheader")))
(def menu (r/adapt-react-class (aget js/MaterialUI "Menu")))
(def menu-item (r/adapt-react-class (aget js/MaterialUI "MenuItem")))
(def menu-list (r/adapt-react-class (aget js/MaterialUI "MenuList")))
(def mobile-stepper (r/adapt-react-class (aget js/MaterialUI "MobileStepper")))
(def modal (r/adapt-react-class (aget js/MaterialUI "Modal")))
(def mui-theme-provider (r/adapt-react-class (aget js/MaterialUI "MuiThemeProvider")))
(def modal-manager (r/adapt-react-class (aget js/MaterialUI "ModalManager")))
(def native-select (r/adapt-react-class (aget js/MaterialUI "NativeSelect")))
(def paper (r/adapt-react-class (aget js/MaterialUI "Paper")))
(def popover (r/adapt-react-class (aget js/MaterialUI "Popover")))
(def popper (r/adapt-react-class (aget js/MaterialUI "Popper")))
(def portal (r/adapt-react-class (aget js/MaterialUI "Portal")))
(def radio (r/adapt-react-class (aget js/MaterialUI "Radio")))
(def radio-group (r/adapt-react-class (aget js/MaterialUI "RadioGroup")))
(def root-ref (r/adapt-react-class (aget js/MaterialUI "RootRef")))
(def select (r/adapt-react-class (aget js/MaterialUI "Select")))
(def slide (r/adapt-react-class (aget js/MaterialUI "Slide")))
(def snackbar (r/adapt-react-class (aget js/MaterialUI "Snackbar")))
(def snackbar-content (r/adapt-react-class (aget js/MaterialUI "SnackbarContent")))
(def step (r/adapt-react-class (aget js/MaterialUI "Step")))
(def step-button (r/adapt-react-class (aget js/MaterialUI "StepButton")))
(def step-connector (r/adapt-react-class (aget js/MaterialUI "StepConnector")))
(def step-content (r/adapt-react-class (aget js/MaterialUI "StepContent")))
(def step-icon (r/adapt-react-class (aget js/MaterialUI "StepIcon")))
(def step-label (r/adapt-react-class (aget js/MaterialUI "StepLabel")))
(def stepper (r/adapt-react-class (aget js/MaterialUI "Stepper")))
(def svg-icon (r/adapt-react-class (aget js/MaterialUI "SvgIcon")))
(def swipeable-drawer (r/adapt-react-class (aget js/MaterialUI "SwipeableDrawer")))
(def switch (r/adapt-react-class (aget js/MaterialUI "Switch")))
(def table (r/adapt-react-class (aget js/MaterialUI "Table")))
(def table-body (r/adapt-react-class (aget js/MaterialUI "TableBody")))
(def table-cell (r/adapt-react-class (aget js/MaterialUI "TableCell")))
(def table-footer (r/adapt-react-class (aget js/MaterialUI "TableFooter")))
(def table-head (r/adapt-react-class (aget js/MaterialUI "TableHead")))
(def table-pagination (r/adapt-react-class (aget js/MaterialUI "TablePagination")))
(def table-row (r/adapt-react-class (aget js/MaterialUI "TableRow")))
(def table-sort-label (r/adapt-react-class (aget js/MaterialUI "TableSortLabel")))
(def tabs (r/adapt-react-class (aget js/MaterialUI "Tabs")))
(def tab (r/adapt-react-class (aget js/MaterialUI "Tab")))
(def text-field (r/adapt-react-class (aget js/MaterialUI "TextField")))
(def toolbar (r/adapt-react-class (aget js/MaterialUI "Toolbar")))
(def tooltip (r/adapt-react-class (aget js/MaterialUI "Tooltip")))
(def typography (r/adapt-react-class (aget js/MaterialUI "Typography")))
(def with-mobile-dialog (r/adapt-react-class (aget js/MaterialUI "withMobileDialog")))
(def with-width (r/adapt-react-class (aget js/MaterialUI "withWidth")))
(def zoom (r/adapt-react-class (aget js/MaterialUI "Zoom")))