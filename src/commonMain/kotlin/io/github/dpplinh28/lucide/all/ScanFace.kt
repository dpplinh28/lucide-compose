package io.github.dpplinh28.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.dpplinh28.lucide.LucideIcons
import io.github.dpplinh28.lucide.LucideIconDefinition
import io.github.dpplinh28.lucide.asImageVector
import io.github.dpplinh28.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("ScanFace") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(3f, 7f)
                verticalLineTo(5f)
                arcToRelative(2f, 2f, 0f, false, true, 2f, -2f)
                horizontalLineToRelative(2f)
            }
            lucidePath(strokeWidth) {
                moveTo(17f, 3f)
                horizontalLineToRelative(2f)
                arcToRelative(2f, 2f, 0f, false, true, 2f, 2f)
                verticalLineToRelative(2f)
            }
            lucidePath(strokeWidth) {
                moveTo(21f, 17f)
                verticalLineToRelative(2f)
                arcToRelative(2f, 2f, 0f, false, true, -2f, 2f)
                horizontalLineToRelative(-2f)
            }
            lucidePath(strokeWidth) {
                moveTo(7f, 21f)
                horizontalLineTo(5f)
                arcToRelative(2f, 2f, 0f, false, true, -2f, -2f)
                verticalLineToRelative(-2f)
            }
            lucidePath(strokeWidth) {
                moveTo(8f, 14f)
                reflectiveCurveToRelative(1.5f, 2f, 4f, 2f)
                reflectiveCurveToRelative(4f, -2f, 4f, -2f)
            }
            lucidePath(strokeWidth) {
                moveTo(9f, 9f)
                horizontalLineToRelative(.01f)
            }
            lucidePath(strokeWidth) {
                moveTo(15f, 9f)
                horizontalLineToRelative(.01f)
            }
}

public val LucideIcons.All.ScanFaceDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.ScanFace: ImageVector
    @Composable get() = ScanFaceDefinition.asImageVector()
