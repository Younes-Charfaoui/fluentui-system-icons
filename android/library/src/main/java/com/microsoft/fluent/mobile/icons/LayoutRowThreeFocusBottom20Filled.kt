package com.microsoft.fluent.mobile.icons

import androidx.compose.material.icons.materialPath
import androidx.compose.ui.graphics.vector.ImageVector
import com.microsoft.fluent.mobile.FluentIcons
import com.microsoft.fluent.mobile.fluentIcon

public val FluentIcons.Filled.LayoutRowThreeFocusBottom20: ImageVector
  get() {
    if (_layoutRowThreeFocusBottom20 != null) {
      return _layoutRowThreeFocusBottom20!!
    }
    _layoutRowThreeFocusBottom20 = fluentIcon(name = "Filled.LayoutRowThreeFocusBottom20", 20f) {
      materialPath {
          moveTo(6.0F, 17.0F)
          curveToRelative(-1.657F, 0.0F, -3.0F, -1.343F, -3.0F, -3.0F)
          verticalLineTo(6.0F)
          curveToRelative(0.0F, -1.657F, 1.343F, -3.0F, 3.0F, -3.0F)
          horizontalLineToRelative(8.0F)
          curveToRelative(1.657F, 0.0F, 3.0F, 1.343F, 3.0F, 3.0F)
          verticalLineToRelative(8.0F)
          curveToRelative(0.0F, 1.657F, -1.343F, 3.0F, -3.0F, 3.0F)
          horizontalLineTo(6.0F)
          close()
          moveToRelative(10.0F, -9.0F)
          horizontalLineTo(4.0F)
          verticalLineToRelative(4.0F)
          horizontalLineToRelative(12.0F)
          verticalLineTo(8.0F)
          close()
          moveToRelative(0.0F, -1.0F)
          verticalLineTo(6.0F)
          curveToRelative(0.0F, -1.105F, -0.895F, -2.0F, -2.0F, -2.0F)
          horizontalLineTo(6.0F)
          curveTo(4.895F, 4.0F, 4.0F, 4.895F, 4.0F, 6.0F)
          verticalLineToRelative(1.0F)
          horizontalLineToRelative(12.0F)
          close()        
      }
    }
    return _layoutRowThreeFocusBottom20!!
  }

private var _layoutRowThreeFocusBottom20: ImageVector? = null
