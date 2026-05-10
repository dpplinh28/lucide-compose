package io.github.dpplinh28.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.dpplinh28.lucide.LucideIcons
import io.github.dpplinh28.lucide.LucideIconDefinition
import io.github.dpplinh28.lucide.asImageVector
import io.github.dpplinh28.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("MapPinPlus") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(19.914f, 11.105f)
                arcTo(7.298f, 7.298f, 0f, false, false, 20f, 10f)
                arcToRelative(8f, 8f, 0f, false, false, -16f, 0f)
                curveToRelative(0f, 4.993f, 5.539f, 10.193f, 7.399f, 11.799f)
                arcToRelative(1f, 1f, 0f, false, false, 1.202f, 0f)
                arcToRelative(32f, 32f, 0f, false, false, .824f, -.738f)
            }
            lucidePath(strokeWidth) {
                moveTo(9.0f, 10.0f)
                arcToRelative(3.0f, 3.0f, 0f, true, false, 6.0f, 0f)
                arcToRelative(3.0f, 3.0f, 0f, true, false, -6.0f, 0f)
            }
            lucidePath(strokeWidth) {
                moveTo(16f, 18f)
                horizontalLineToRelative(6f)
            }
            lucidePath(strokeWidth) {
                moveTo(19f, 15f)
                verticalLineToRelative(6f)
            }
}

public val LucideIcons.All.MapPinPlusDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.MapPinPlus: ImageVector
    @Composable get() = MapPinPlusDefinition.asImageVector()
