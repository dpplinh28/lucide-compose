package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("InspectionPanel") { strokeWidth ->
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
                moveTo(7f, 7f)
                horizontalLineToRelative(.01f)
            }
            lucidePath(strokeWidth) {
                moveTo(17f, 7f)
                horizontalLineToRelative(.01f)
            }
            lucidePath(strokeWidth) {
                moveTo(7f, 17f)
                horizontalLineToRelative(.01f)
            }
            lucidePath(strokeWidth) {
                moveTo(17f, 17f)
                horizontalLineToRelative(.01f)
            }
}

public val LucideIcons.All.InspectionPanelDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.InspectionPanel: ImageVector
    @Composable get() = InspectionPanelDefinition.asImageVector()
