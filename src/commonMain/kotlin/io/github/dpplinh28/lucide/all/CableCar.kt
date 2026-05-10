package io.github.dpplinh28.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.dpplinh28.lucide.LucideIcons
import io.github.dpplinh28.lucide.LucideIconDefinition
import io.github.dpplinh28.lucide.asImageVector
import io.github.dpplinh28.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("CableCar") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(10f, 3f)
                horizontalLineToRelative(.01f)
            }
            lucidePath(strokeWidth) {
                moveTo(14f, 2f)
                horizontalLineToRelative(.01f)
            }
            lucidePath(strokeWidth) {
                moveToRelative(2f, 9f)
                lineToRelative(20f, -5f)
            }
            lucidePath(strokeWidth) {
                moveTo(12f, 12f)
                verticalLineTo(6.5f)
            }
            lucidePath(strokeWidth) {
                moveTo(7.0f, 12.0f)
                horizontalLineToRelative(10.0f)
                arcToRelative(3.0f, 0.0f, 0f, false, true, 3.0f, 0.0f)
                verticalLineToRelative(10.0f)
                arcToRelative(3.0f, 0.0f, 0f, false, true, -3.0f, 0.0f)
                horizontalLineToRelative(-10.0f)
                arcToRelative(3.0f, 0.0f, 0f, false, true, -3.0f, -0.0f)
                verticalLineToRelative(-10.0f)
                arcToRelative(3.0f, 0.0f, 0f, false, true, 3.0f, -0.0f)
                close()
            }
            lucidePath(strokeWidth) {
                moveTo(9f, 12f)
                verticalLineToRelative(5f)
            }
            lucidePath(strokeWidth) {
                moveTo(15f, 12f)
                verticalLineToRelative(5f)
            }
            lucidePath(strokeWidth) {
                moveTo(4f, 17f)
                horizontalLineToRelative(16f)
            }
}

public val LucideIcons.All.CableCarDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.CableCar: ImageVector
    @Composable get() = CableCarDefinition.asImageVector()
