package com.microsoft.fluent.mobile.icons

import androidx.compose.material.icons.materialPath
import androidx.compose.ui.graphics.vector.ImageVector
import com.microsoft.fluent.mobile.FluentIcons
import com.microsoft.fluent.mobile.fluentIcon

public val FluentIcons.Filled.LayoutRowThreeFocusTop20: ImageVector
  get() {
    if (_layoutRowThreeFocusTop20 != null) {
      return _layoutRowThreeFocusTop20!!
    }
    _layoutRowThreeFocusTop20 = fluentIcon(name = "Filled.LayoutRowThreeFocusTop20", 20f) {
      materialPath {
          moveTo(6.0F, 3.0F)
          curveTo(4.343F, 3.0F, 3.0F, 4.343F, 3.0F, 6.0F)
          verticalLineToRelative(8.0F)
          curveToRelative(0.0F, 1.657F, 1.343F, 3.0F, 3.0F, 3.0F)
          horizontalLineToRelative(8.0F)
          curveToRelative(1.657F, 0.0F, 3.0F, -1.343F, 3.0F, -3.0F)
          verticalLineTo(6.0F)
          curveToRelative(0.0F, -1.657F, -1.343F, -3.0F, -3.0F, -3.0F)
          horizontalLineTo(6.0F)
          close()
          moveToRelative(10.0F, 9.0F)
          horizontalLineTo(4.0F)
          verticalLineTo(8.0F)
          horizontalLineToRelative(12.0F)
          verticalLineToRelative(4.0F)
          close()
          moveToRelative(0.0F, 1.0F)
          verticalLineToRelative(1.0F)
          curveToRelative(0.0F, 1.105F, -0.895F, 2.0F, -2.0F, 2.0F)
          horizontalLineTo(6.0F)
          curveToRelative(-1.105F, 0.0F, -2.0F, -0.895F, -2.0F, -2.0F)
          verticalLineToRelative(-1.0F)
          horizontalLineToRelative(12.0F)
          close()        
      }
    }
    return _layoutRowThreeFocusTop20!!
  }

private var _layoutRowThreeFocusTop20: ImageVector? = null
