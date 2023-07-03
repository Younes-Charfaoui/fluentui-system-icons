package com.microsoft.fluent.mobile.icons

import androidx.compose.material.icons.materialPath
import androidx.compose.ui.graphics.vector.ImageVector
import com.microsoft.fluent.mobile.FluentIcons
import com.microsoft.fluent.mobile.fluentIcon

public val FluentIcons.Regular.DataHistogram20: ImageVector
  get() {
    if (_dataHistogram20 != null) {
      return _dataHistogram20!!
    }
    _dataHistogram20 = fluentIcon(name = "Regular.DataHistogram20", 20f) {
      materialPath {
          moveTo(8.0F, 5.0F)
          verticalLineToRelative(11.0F)
          horizontalLineToRelative(4.0F)
          verticalLineTo(5.0F)
          curveToRelative(0.0F, -0.552F, -0.448F, -1.0F, -1.0F, -1.0F)
          horizontalLineTo(9.0F)
          curveTo(8.448F, 4.0F, 8.0F, 4.448F, 8.0F, 5.0F)
          close()
          moveTo(7.0F, 9.0F)
          verticalLineTo(5.0F)
          curveToRelative(0.0F, -1.105F, 0.895F, -2.0F, 2.0F, -2.0F)
          horizontalLineToRelative(2.0F)
          curveToRelative(1.105F, 0.0F, 2.0F, 0.895F, 2.0F, 2.0F)
          verticalLineToRelative(1.0F)
          horizontalLineToRelative(2.0F)
          curveToRelative(1.105F, 0.0F, 2.0F, 0.895F, 2.0F, 2.0F)
          verticalLineToRelative(8.5F)
          curveToRelative(0.0F, 0.276F, -0.224F, 0.5F, -0.5F, 0.5F)
          horizontalLineToRelative(-13.0F)
          curveTo(3.224F, 17.0F, 3.0F, 16.776F, 3.0F, 16.5F)
          verticalLineTo(11.0F)
          curveToRelative(0.0F, -1.105F, 0.895F, -2.0F, 2.0F, -2.0F)
          horizontalLineToRelative(2.0F)
          close()
          moveToRelative(0.0F, 7.0F)
          verticalLineToRelative(-6.0F)
          horizontalLineTo(5.0F)
          curveToRelative(-0.552F, 0.0F, -1.0F, 0.448F, -1.0F, 1.0F)
          verticalLineToRelative(5.0F)
          horizontalLineToRelative(3.0F)
          close()
          moveToRelative(6.0F, 0.0F)
          horizontalLineToRelative(3.0F)
          verticalLineTo(8.0F)
          curveToRelative(0.0F, -0.552F, -0.448F, -1.0F, -1.0F, -1.0F)
          horizontalLineToRelative(-2.0F)
          verticalLineToRelative(9.0F)
          close()        
      }
    }
    return _dataHistogram20!!
  }

private var _dataHistogram20: ImageVector? = null
