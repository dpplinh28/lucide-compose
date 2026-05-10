package io.github.dpplinh28.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.dpplinh28.lucide.LucideIcons
import io.github.dpplinh28.lucide.LucideIconDefinition
import io.github.dpplinh28.lucide.asImageVector
import io.github.dpplinh28.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("ChefHat") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(17f, 21f)
                arcToRelative(1f, 1f, 0f, false, false, 1f, -1f)
                verticalLineToRelative(-5.35f)
                curveToRelative(0f, -.457f, .316f, -.844f, .727f, -1.041f)
                arcToRelative(4f, 4f, 0f, false, false, -2.134f, -7.589f)
                arcToRelative(5f, 5f, 0f, false, false, -9.186f, 0f)
                arcToRelative(4f, 4f, 0f, false, false, -2.134f, 7.588f)
                curveToRelative(.411f, .198f, .727f, .585f, .727f, 1.041f)
                verticalLineTo(20f)
                arcToRelative(1f, 1f, 0f, false, false, 1f, 1f)
                close()
            }
            lucidePath(strokeWidth) {
                moveTo(6f, 17f)
                horizontalLineToRelative(12f)
            }
}

public val LucideIcons.All.ChefHatDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.ChefHat: ImageVector
    @Composable get() = ChefHatDefinition.asImageVector()
