package io.github.dpplinh28.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.dpplinh28.lucide.LucideIcons
import io.github.dpplinh28.lucide.LucideIconDefinition
import io.github.dpplinh28.lucide.asImageVector
import io.github.dpplinh28.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("PanelLeftRightDashed") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(15f, 10f)
                verticalLineTo(9f)
            }
            lucidePath(strokeWidth) {
                moveTo(15f, 15f)
                verticalLineToRelative(-1f)
            }
            lucidePath(strokeWidth) {
                moveTo(15f, 21f)
                verticalLineToRelative(-2f)
            }
            lucidePath(strokeWidth) {
                moveTo(15f, 5f)
                verticalLineTo(3f)
            }
            lucidePath(strokeWidth) {
                moveTo(9f, 10f)
                verticalLineTo(9f)
            }
            lucidePath(strokeWidth) {
                moveTo(9f, 15f)
                verticalLineToRelative(-1f)
            }
            lucidePath(strokeWidth) {
                moveTo(9f, 21f)
                verticalLineToRelative(-2f)
            }
            lucidePath(strokeWidth) {
                moveTo(9f, 5f)
                verticalLineTo(3f)
            }
            lucidePath(strokeWidth) {
                moveTo(5.0f, 3.0f)
                horizontalLineToRelative(14.0f)
                arcToRelative(2.0f, 0.0f, 0f, false, true, 2.0f, 0.0f)
                verticalLineToRelative(18.0f)
                arcToRelative(2.0f, 0.0f, 0f, false, true, -2.0f, 0.0f)
                horizontalLineToRelative(-14.0f)
                arcToRelative(2.0f, 0.0f, 0f, false, true, -2.0f, -0.0f)
                verticalLineToRelative(-18.0f)
                arcToRelative(2.0f, 0.0f, 0f, false, true, 2.0f, -0.0f)
                close()
            }
}

public val LucideIcons.All.PanelLeftRightDashedDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.PanelLeftRightDashed: ImageVector
    @Composable get() = PanelLeftRightDashedDefinition.asImageVector()
