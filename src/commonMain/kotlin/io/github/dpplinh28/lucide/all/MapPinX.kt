package io.github.dpplinh28.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.dpplinh28.lucide.LucideIcons
import io.github.dpplinh28.lucide.LucideIconDefinition
import io.github.dpplinh28.lucide.asImageVector
import io.github.dpplinh28.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("MapPinX") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(19.752f, 11.901f)
                arcTo(7.78f, 7.78f, 0f, false, false, 20f, 10f)
                arcToRelative(8f, 8f, 0f, false, false, -16f, 0f)
                curveToRelative(0f, 4.993f, 5.539f, 10.193f, 7.399f, 11.799f)
                arcToRelative(1f, 1f, 0f, false, false, 1.202f, 0f)
                arcToRelative(19f, 19f, 0f, false, false, .09f, -.077f)
            }
            lucidePath(strokeWidth) {
                moveTo(9.0f, 10.0f)
                arcToRelative(3.0f, 3.0f, 0f, true, false, 6.0f, 0f)
                arcToRelative(3.0f, 3.0f, 0f, true, false, -6.0f, 0f)
            }
            lucidePath(strokeWidth) {
                moveToRelative(21.5f, 15.5f)
                lineToRelative(-5f, 5f)
            }
            lucidePath(strokeWidth) {
                moveToRelative(21.5f, 20.5f)
                lineToRelative(-5f, -5f)
            }
}

public val LucideIcons.All.MapPinXDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.MapPinX: ImageVector
    @Composable get() = MapPinXDefinition.asImageVector()
