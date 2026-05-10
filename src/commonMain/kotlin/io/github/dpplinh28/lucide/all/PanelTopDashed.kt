package io.github.dpplinh28.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.dpplinh28.lucide.LucideIcons
import io.github.dpplinh28.lucide.LucideIconDefinition
import io.github.dpplinh28.lucide.asImageVector
import io.github.dpplinh28.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("PanelTopDashed") { strokeWidth ->
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
            lucidePath(strokeWidth) {
                moveTo(14f, 9f)
                horizontalLineToRelative(1f)
            }
            lucidePath(strokeWidth) {
                moveTo(19f, 9f)
                horizontalLineToRelative(2f)
            }
            lucidePath(strokeWidth) {
                moveTo(3f, 9f)
                horizontalLineToRelative(2f)
            }
            lucidePath(strokeWidth) {
                moveTo(9f, 9f)
                horizontalLineToRelative(1f)
            }
}

public val LucideIcons.All.PanelTopDashedDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.PanelTopDashed: ImageVector
    @Composable get() = PanelTopDashedDefinition.asImageVector()
