package com.microsoft.fluent.mobile.icons

import androidx.compose.material.icons.materialPath
import androidx.compose.ui.graphics.vector.ImageVector
import com.microsoft.fluent.mobile.FluentIcons
import com.microsoft.fluent.mobile.fluentIcon

public val FluentIcons.Filled.PersonRibbon20: ImageVector
  get() {
    if (_personRibbon20 != null) {
      return _personRibbon20!!
    }
    _personRibbon20 = fluentIcon(name = "Filled.PersonRibbon20", 20f) {
      materialPath {
          moveTo(10.0F, 2.0F)
          curveTo(7.79F, 2.0F, 6.0F, 3.79F, 6.0F, 6.0F)
          reflectiveCurveToRelative(1.79F, 4.0F, 4.0F, 4.0F)
          reflectiveCurveToRelative(4.0F, -1.79F, 4.0F, -4.0F)
          reflectiveCurveToRelative(-1.79F, -4.0F, -4.0F, -4.0F)
          close()
          moveToRelative(-4.991F, 9.0F)
          curveTo(3.903F, 11.0F, 3.0F, 11.887F, 3.0F, 13.0F)
          curveToRelative(0.0F, 1.691F, 0.833F, 2.966F, 2.135F, 3.797F)
          curveTo(6.417F, 17.614F, 8.145F, 18.0F, 10.0F, 18.0F)
          curveToRelative(1.061F, 0.0F, 2.081F, -0.126F, 3.0F, -0.388F)
          verticalLineToRelative(-1.967F)
          curveToRelative(-0.622F, -0.705F, -1.0F, -1.631F, -1.0F, -2.646F)
          curveToRelative(0.0F, -0.728F, 0.195F, -1.41F, 0.535F, -1.999F)
          horizontalLineTo(5.009F)
          close()
          moveTo(16.0F, 16.0F)
          curveToRelative(1.657F, 0.0F, 3.0F, -1.344F, 3.0F, -3.0F)
          curveToRelative(0.0F, -1.657F, -1.343F, -3.0F, -3.0F, -3.0F)
          reflectiveCurveToRelative(-3.0F, 1.343F, -3.0F, 3.0F)
          curveToRelative(0.0F, 1.656F, 1.343F, 3.0F, 3.0F, 3.0F)
          close()
          moveToRelative(0.0F, 1.0F)
          curveToRelative(0.729F, 0.0F, 1.412F, -0.196F, 2.0F, -0.536F)
          verticalLineToRelative(2.285F)
          curveToRelative(0.0F, 0.194F, -0.211F, 0.314F, -0.378F, 0.215F)
          lineTo(16.0F, 18.0F)
          lineToRelative(-1.622F, 0.965F)
          curveTo(14.21F, 19.064F, 14.0F, 18.944F, 14.0F, 18.75F)
          verticalLineToRelative(-2.285F)
          curveTo(14.588F, 16.805F, 15.271F, 17.0F, 16.0F, 17.0F)
          close()        
      }
    }
    return _personRibbon20!!
  }

private var _personRibbon20: ImageVector? = null
