package io.github.dpplinh28.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.dpplinh28.lucide.LucideIcons
import io.github.dpplinh28.lucide.LucideIconDefinition
import io.github.dpplinh28.lucide.asImageVector
import io.github.dpplinh28.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("Ambulance") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(10f, 10f)
                horizontalLineTo(6f)
            }
            lucidePath(strokeWidth) {
                moveTo(14f, 18f)
                verticalLineTo(6f)
                arcToRelative(2f, 2f, 0f, false, false, -2f, -2f)
                horizontalLineTo(4f)
                arcToRelative(2f, 2f, 0f, false, false, -2f, 2f)
                verticalLineToRelative(11f)
                arcToRelative(1f, 1f, 0f, false, false, 1f, 1f)
                horizontalLineToRelative(2f)
            }
            lucidePath(strokeWidth) {
                moveTo(19f, 18f)
                horizontalLineToRelative(2f)
                arcToRelative(1f, 1f, 0f, false, false, 1f, -1f)
                verticalLineToRelative(-3.28f)
                arcToRelative(1f, 1f, 0f, false, false, -.684f, -.948f)
                lineToRelative(-1.923f, -.641f)
                arcToRelative(1f, 1f, 0f, false, true, -.578f, -.502f)
                lineToRelative(-1.539f, -3.076f)
                arcTo(1f, 1f, 0f, false, false, 16.382f, 8f)
                horizontalLineTo(14f)
            }
            lucidePath(strokeWidth) {
                moveTo(8f, 8f)
                verticalLineToRelative(4f)
            }
            lucidePath(strokeWidth) {
                moveTo(9f, 18f)
                horizontalLineToRelative(6f)
            }
            lucidePath(strokeWidth) {
                moveTo(15.0f, 18.0f)
                arcToRelative(2.0f, 2.0f, 0f, true, false, 4.0f, 0f)
                arcToRelative(2.0f, 2.0f, 0f, true, false, -4.0f, 0f)
            }
            lucidePath(strokeWidth) {
                moveTo(5.0f, 18.0f)
                arcToRelative(2.0f, 2.0f, 0f, true, false, 4.0f, 0f)
                arcToRelative(2.0f, 2.0f, 0f, true, false, -4.0f, 0f)
            }
}

public val LucideIcons.All.AmbulanceDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.Ambulance: ImageVector
    @Composable get() = AmbulanceDefinition.asImageVector()
