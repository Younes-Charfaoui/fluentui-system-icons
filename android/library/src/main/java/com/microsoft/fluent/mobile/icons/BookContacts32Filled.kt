package com.microsoft.fluent.mobile.icons

import androidx.compose.material.icons.materialPath
import androidx.compose.ui.graphics.vector.ImageVector
import com.microsoft.fluent.mobile.FluentIcons
import com.microsoft.fluent.mobile.fluentIcon

public val FluentIcons.Filled.BookContacts32: ImageVector
  get() {
    if (_bookContacts32 != null) {
      return _bookContacts32!!
    }
    _bookContacts32 = fluentIcon(name = "Filled.BookContacts32", 32f) {
      materialPath {
          moveTo(9.0F, 30.0F)
          horizontalLineToRelative(17.0F)
          curveToRelative(0.552F, 0.0F, 1.0F, -0.448F, 1.0F, -1.0F)
          reflectiveCurveToRelative(-0.448F, -1.0F, -1.0F, -1.0F)
          horizontalLineTo(9.0F)
          curveToRelative(-1.105F, 0.0F, -2.0F, -0.895F, -2.0F, -2.0F)
          horizontalLineToRelative(18.25F)
          curveToRelative(0.966F, 0.0F, 1.75F, -0.784F, 1.75F, -1.75F)
          verticalLineTo(6.0F)
          curveToRelative(0.0F, -2.21F, -1.79F, -4.0F, -4.0F, -4.0F)
          horizontalLineTo(9.0F)
          curveTo(6.79F, 2.0F, 5.0F, 3.79F, 5.0F, 6.0F)
          verticalLineToRelative(20.0F)
          curveToRelative(0.0F, 2.21F, 1.79F, 4.0F, 4.0F, 4.0F)
          close()
          moveToRelative(10.0F, -19.5F)
          curveToRelative(0.0F, 1.657F, -1.343F, 3.0F, -3.0F, 3.0F)
          reflectiveCurveToRelative(-3.0F, -1.343F, -3.0F, -3.0F)
          reflectiveCurveToRelative(1.343F, -3.0F, 3.0F, -3.0F)
          reflectiveCurveToRelative(3.0F, 1.343F, 3.0F, 3.0F)
          close()
          moveToRelative(2.5F, 6.75F)
          curveToRelative(0.0F, 1.868F, -1.571F, 3.75F, -5.5F, 3.75F)
          curveToRelative(-3.929F, 0.0F, -5.5F, -1.875F, -5.5F, -3.75F)
          verticalLineToRelative(-0.205F)
          curveToRelative(0.0F, -1.13F, 0.916F, -2.045F, 2.046F, -2.045F)
          horizontalLineToRelative(6.909F)
          curveToRelative(1.13F, 0.0F, 2.045F, 0.915F, 2.045F, 2.045F)
          verticalLineToRelative(0.205F)
          close()        
      }
    }
    return _bookContacts32!!
  }

private var _bookContacts32: ImageVector? = null
