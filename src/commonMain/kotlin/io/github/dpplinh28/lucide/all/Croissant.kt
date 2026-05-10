package io.github.dpplinh28.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.dpplinh28.lucide.LucideIcons
import io.github.dpplinh28.lucide.LucideIconDefinition
import io.github.dpplinh28.lucide.asImageVector
import io.github.dpplinh28.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("Croissant") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(10.2f, 18f)
                horizontalLineTo(4.774f)
                arcToRelative(1.5f, 1.5f, 0f, false, true, -1.352f, -.97f)
                arcToRelative(11f, 11f, 0f, false, true, .132f, -6.487f)
            }
            lucidePath(strokeWidth) {
                moveTo(18f, 10.2f)
                verticalLineTo(4.774f)
                arcToRelative(1.5f, 1.5f, 0f, false, false, -.97f, -1.352f)
                arcToRelative(11f, 11f, 0f, false, false, -6.486f, .132f)
            }
            lucidePath(strokeWidth) {
                moveTo(18f, 5f)
                arcToRelative(4f, 3f, 0f, false, true, 4f, 3f)
                arcToRelative(2f, 2f, 0f, false, true, -2f, 2f)
                arcToRelative(10f, 10f, 0f, false, false, -5.139f, 1.42f)
            }
            lucidePath(strokeWidth) {
                moveTo(5f, 18f)
                arcToRelative(3f, 4f, 0f, false, false, 3f, 4f)
                arcToRelative(2f, 2f, 0f, false, false, 2f, -2f)
                arcToRelative(10f, 10f, 0f, false, true, 1.42f, -5.14f)
            }
            lucidePath(strokeWidth) {
                moveTo(8.709f, 2.554f)
                arcToRelative(10f, 10f, 0f, false, false, -6.155f, 6.155f)
                arcToRelative(1.5f, 1.5f, 0f, false, false, .676f, 1.626f)
                lineToRelative(9.807f, 5.42f)
                arcToRelative(2f, 2f, 0f, false, false, 2.718f, -2.718f)
                lineToRelative(-5.42f, -9.807f)
                arcToRelative(1.5f, 1.5f, 0f, false, false, -1.626f, -.676f)
            }
}

public val LucideIcons.All.CroissantDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.Croissant: ImageVector
    @Composable get() = CroissantDefinition.asImageVector()
